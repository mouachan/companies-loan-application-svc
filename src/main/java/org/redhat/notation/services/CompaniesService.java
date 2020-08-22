package org.redhat.notation.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.redhat.notation.rest.CompaniesRemoteService;

@ApplicationScoped
public class CompaniesService {
    
    @Inject
    @RestClient
    CompaniesRemoteService companiesRemoteService;

    @Fallback(fallbackMethod = "missingCompany")
    public boolean get(String siren) {
        System.out.println("calling service");
        return companiesRemoteService.get(siren);
    }
    
    public boolean missingCompany(String siren) {
        return false;
    }
}
