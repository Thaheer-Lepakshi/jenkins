def gv
pipeline {
    agent any

    tools {
        maven 'my-maven'
    }

    options {
        buildDiscarder(logRotator(numToKeepStr: '10'))
    }

    parameters {
        choice(name: 'ENV', choices: ['dev', 'test', 'sandbox', 'prod'], description: 'Select the environment')
        choice(name: 'Version', choices: ['v1.0.0', 'v2.0.0'], description: 'Select the version')
        booleanParam(name: 'Deploy', defaultValue: true, description: 'Deploy to')
    }

    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }

        stage('build') {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }

        stage('test') {
            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage('Deploy') {
            input {
                message "Are you sure you want to deploy to ${params.ENV}?"
                ok "Yes, deploy"
                parameters {
                    choice(name: 'ENV', choices: ['de', 'te', 'sand', 'produ'], description: 'Select the environment')
                    choice(name: 'Version', choices: ['v1', 'v2'], description: 'Select the version')
                }
            }

            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
