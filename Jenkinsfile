pipeline{
    agent any
    tools {
        maven 'my-maven'
    }
    stages{
        stage('Build'){
            when {
                branch 'dev'   // only run if branch is develop
            }
            steps{
                echo 'Building..'
            }
        }
        stage('Test'){
            when {
                branch 'test'   // only run if branch is test
            }
            steps{
                echo 'Testing..'
            }
        }
        stage('Deploy'){
            when {
                branch 'main'   // only run if branch is main
            }
            steps{
                echo 'Deploying....'
            }
        }
    }

}
