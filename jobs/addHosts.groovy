pipelineJob("know hosts") {
    definition {
        cpsScm{
            scm {
                git {
                    remote {
                        name("jenkins-tests")
                        url("https://github.com/Viroide/jenkins-tests.git")
                    }
                    branch('master')
                    scriptPath("jenkinsfiles/add-hosts")
                }
            }
        }
    }
}
