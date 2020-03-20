pipelineJob("promote-TEST-to-PROD-servers-update") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/promote-TEST-to-PROD-servers-update")
                }
            }
        }
    }
    triggers {
        cron('@daily')
    }
}
