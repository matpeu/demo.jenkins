pipeline {
    agent any

    stages {
        stage('Build Maven') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Docker Compose') {
            steps {
                sh 'docker compose up -d --build'
            }
        }
    }
}
