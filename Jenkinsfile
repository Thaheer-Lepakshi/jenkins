pipeline{
    agent any
    tools {
        maven 'my-maven'
    }
    stages{
        stage('Build'){
            when {
                branch 'origin/dev'   // only run if branch is dev
            }
            steps{
                echo 'Building..'
            }
        }
        stage('Test'){
            when {
                branch 'origin/test'   // only run if branch is test
            }
            steps{
                echo 'Testing..'
            }
        }
        stage('Deploy'){
            when {
                branch 'origin/main'   // only run if branch is main
            }
            steps{
                echo 'Deploying....'
            }
        }
    }

}
