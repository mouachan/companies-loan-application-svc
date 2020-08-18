/**
 *  Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.kie.kogito.app;

import org.jbpm.workflow.instance.impl.WorkflowProcessInstanceImpl;
import org.kie.kogito.monitoring.process.PrometheusProcessEventListener;
import org.redhat.notation.NoteApplication;
import org.kie.api.event.process.ProcessCompletedEvent;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;

public class LoanApplicationPrometheusProcessEventListener extends PrometheusProcessEventListener {
	
	protected final Counter numberOfVisaApplicationsApproved = Counter.build()
            .name("acme_travels_visas_approved_total")
            .help("Approved visa applications")
            .labelNames("app_id", "country", "duration", "nationality")
            .register();
	
	protected final Counter numberOfVisaApplicationsRejected = Counter.build()
            .name("acme_travels_visas_rejected_total")
            .help("Rejected visa applications")
            .labelNames("app_id", "country", "duration", "nationality")
            .register();

	private String identifier;
	
	public LoanApplicationPrometheusProcessEventListener(String identifier) {
		super(identifier);
		this.identifier = identifier;
	}
	
	public void cleanup() {
		CollectorRegistry.defaultRegistry.unregister(numberOfVisaApplicationsApproved);
		CollectorRegistry.defaultRegistry.unregister(numberOfVisaApplicationsRejected);
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		super.afterProcessCompleted(event);
		final WorkflowProcessInstanceImpl processInstance = (WorkflowProcessInstanceImpl) event.getProcessInstance();
		
		if (processInstance.getProcessId().equals("NoteApplications")) {
			NoteApplication application = (NoteApplication) processInstance.getVariable("NoteApplication");
		
			if (application.isApproved()) {
				numberOfVisaApplicationsApproved.labels(identifier, safeValue(application.getCountry()), String.valueOf(application.getDuration()), safeValue(application.getNationality())).inc();
			} else {
				numberOfVisaApplicationsRejected.labels(identifier, safeValue(application.getCountry()), String.valueOf(application.getDuration()), safeValue(application.getNationality())).inc();
			}
		
		}
	}

	protected String safeValue(String value) {
		if (value == null) {
			return "unknown";
		}
		
		return value;
	}
}
