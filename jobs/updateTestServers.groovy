pipelineJob("Update-servers-using-the-package-list-TEST") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/update-test-servers")
                }
            }
        }
    }
    triggers {
        cron('@daily')
    }
}
