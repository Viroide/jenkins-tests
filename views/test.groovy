listView('TEST-tasks') {
    description('Tasks for test environment')
    jobs {
        regex('.*TEST')
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
