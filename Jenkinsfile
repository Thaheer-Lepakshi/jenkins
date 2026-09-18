pipeline {
    agent any
    tools {
        maven 'my-maven'
    }
    stages {
        stage('Build') {
            when { branch 'dev' }
            steps {
                echo "Building on branch: ${env.BRANCH_NAME}"
            }
        }
        stage('Test') {
            when { branch 'test' }
            steps {
                echo "Testing on branch: ${env.BRANCH_NAME}"
            }
        }
        stage('Deploy') {
            when { branch 'main' }
            steps {
                echo "Deploying on branch: ${env.BRANCH_NAME}"
            }
        }
    }
}
