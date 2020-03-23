def views = [
    'test':[title: "TEST-tasks", description: 'Tasks for TEST environment', pattern: '.*TEST'],
    'prod':[title: "PROD-tasks", description: 'Tasks for PROD environment', pattern: '.*PROD.*'],
]

views.each{ envName, envParams ->
    listView(envParams.title) {
        description(envParams.description)
        jobs {
            regex(envParams.pattern)
        }

        columns {
            status()
            weather()
            name()
            lastSuccess()
            lastFailure()
            lastDuration()
            buildButton()
        }
}}

