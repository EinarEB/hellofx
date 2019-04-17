package org.openjfx.data;

import org.openjfx.model.JobbSøker;

import java.util.ArrayList;
import java.util.List;

public class JobbSøkerRegister {
    private List<JobbSøker> jobbSøkere = new ArrayList<>();

    public void settInnJobbSøker(JobbSøker jobbSøker){
        jobbSøkere.add(jobbSøker);
        //TODO save to file
    }
}
