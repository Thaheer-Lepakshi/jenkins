pipeline {
    agent any
    tools {
        maven 'my-maven'
    }
    stages {
        stage('Build') {
            when {
                expression { env.GIT_BRANCH == 'origin/dev' }
            }
            steps {
                echo "Building on branch: ${env.GIT_BRANCH}"
            }
        }
        stage('Test') {
            when {
                expression { env.GIT_BRANCH == 'origin/test' }
            }
            steps {
                echo "Testing on branch: ${env.GIT_BRANCH}"
            }
        }
        stage('Deploy') {
            when {
                expression { env.GIT_BRANCH == 'origin/main' }
            }
            steps {
                echo "Deploying on branch: ${env.GIT_BRANCH}"
            }
        }
    }
}
