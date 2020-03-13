pipelineJob("get-upgradeable-package-list-TEST") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/get-upgradeable-package-list-TEST")
                }
            }
        }
    }
    triggers {
        cron('@daily')
    }
}
