pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'
        jdk 'Amazon17'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo '🎉 The build was successful!'
            sh 'java -cp target/devops-fortune-1.0-SNAPSHOT.jar com.example.FortuneTeller'
        }
        failure {
            echo '❌ Build failed.'
        }
    }
}
