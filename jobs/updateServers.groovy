pipelineJob("Update servers using the package list") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/update-servers")
                }
            }
        }
    }
    triggers {
        cron('@daily')
    }
}
