pipelineJob("job1") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/job1")
                }
            }
        }
    }
    triggers {
        cron('@daily')
    }
}
