pipeline {
    agent any

    tools {
        maven 'Maven-3.9.6'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/deeptomay/cl-app-backend.git'
            }
        }

        stage('Build Spring Boot JAR') {
            steps {
                echo 'Building Spring Boot application using Jenkins Maven...'
                bat 'mvn -version'
                bat 'mvn clean package -DskipTests'
            }
        }
    }

    post {
        success {
            echo '✅ Build successful'
        }
        failure {
            echo '❌ Build failed. Check Jenkins logs.'
        }
    }
}
