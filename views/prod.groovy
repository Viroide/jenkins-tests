listView('PROD-tasks') {
    description('Tasks for prod environment')
    jobs {
        regex('.*PROD')
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
}
