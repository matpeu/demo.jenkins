pipeline {
    agent any

    tools {
        maven 'maven-3.10.1'
    }

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
