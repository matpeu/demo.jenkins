pipeline {
    agent any

    tools {
        maven 'maven-3.10.1'
    }

    stage('Debug directories') {
        steps {
            sh 'pwd'
            sh 'ls -la'
            sh 'ls -la target || true'
            sh 'cat docker-compose.yml'
            sh 'cat Dockerfile'
        }
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
