pipeline {
    agent any

    stages {
        stage('Name') {
            steps {
                echo 'Hello this is Jenkins'
            }
        }
    }
}

