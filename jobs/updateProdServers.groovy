pipelineJob("Update-servers-using-the-package-list-PROD") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/update-prod-servers")
                }
            }
        }
    }
    triggers {
        cron('@daily')
    }
}
