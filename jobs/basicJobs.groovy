def jobs = [
    [title: "get-upgradeable-package-list-TEST", scriptPath: "jenkinsfiles/get-upgradeable-package-list-TEST", triggers: "@daily", git: [ name: "jenkins-tests", url: "https://github.com/Viroide/jenkins-tests.git", branch: "master" ]],
    [title: "promote-TEST-to-PROD-servers-update", scriptPath: "jenkinsfiles/promote-TEST-to-PROD-servers-update", triggers: "@daily", git: [ name: "jenkins-tests", url: "https://github.com/Viroide/jenkins-tests.git", branch: "master" ]],
    [title: "Update-servers-using-the-package-list-PROD", scriptPath: "jenkinsfiles/update-prod-servers", triggers: "@daily", git: [ name: "jenkins-tests", url: "https://github.com/Viroide/jenkins-tests.git", branch: "master" ]],
    [title: "Update-servers-using-the-package-list-TEST", scriptPath: "jenkinsfiles/update-test-servers", triggers: "@daily", git: [ name: "jenkins-tests", url: "https://github.com/Viroide/jenkins-tests.git", branch: "master" ]]
]

jobs.each{ jobParams ->
    pipelineJob(jobParams.title) {
        definition {
            cpsScm{
                scm {
                    git {
                        remote {
                            name(jobParams.git.name)
                            url(jobParams.git.url)
                        }
                        branch(jobParams.git.branch)
                        scriptPath(jobParams.scriptPath)
                    }
                }
            }
        }
        triggers {
            cron(jobParams.triggers)
        }
    }
}

