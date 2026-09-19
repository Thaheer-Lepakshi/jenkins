def gv = load 'script.groovy'
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
        /*
        stage('Build') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub',
                    usernameVariable: 'USERNAME',
                    passwordVariable: 'DPWD'
                )]) {
                    sh 'docker pull nginx'
                    sh "docker tag nginx thaheeroutis/jenkins:${BUILD_NUMBER}"
                    sh 'echo "$DPWD" | docker login -u "$USERNAME" --password-stdin'
                    sh "docker push thaheeroutis/jenkins:${BUILD_NUMBER}"
                }
            }
        }
        */
        stage('init') {
            steps {
                gv = load 'script.groovy'
            }
        }
        stage('build') {
            steps {
                gv.buildApp()
            }
        }
        stage('test') {
            steps {
                gv.testApp()
            }
        }
        stage('Deploy') {
            steps {
                gv.deployApp()
            }
        }
    }
}