pipeline {
    agent any
    tools {
        maven 'my-maven'
    }
    stages {
        stage('Build') {
            when {
                anyOf {
                    branch 'dev'
                    branch 'origin/dev'
                }
            }
            steps {
                echo "Building on branch: ${env.BRANCH_NAME}"
            }
        }
        stage('Test') {
            when {
                anyOf {
                    branch 'test'
                    branch 'origin/test'
                }
            }
            steps {
                echo "Testing on branch: ${env.BRANCH_NAME}"
            }
        }
        stage('Deploy') {
            when {
                anyOf {
                    branch 'main'
                    branch 'origin/main'
                }
            }
            steps {
                echo "Deploying on branch: ${env.BRANCH_NAME}"
            }
        }
    }
}
