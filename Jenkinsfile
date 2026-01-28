pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'maven'
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
                echo 'Building Spring Boot application...'
                bat 'java -version'
                bat 'mvn -version'
                bat 'mvn clean package -DskipTests'
            }
        }
    }
}
