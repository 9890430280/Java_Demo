pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo "Cloning repository..."
            }
        }

        stage('Build') {
            steps {
                echo "Compiling Java code..."
                bat 'javac JavaApp.java'
            }
        }

        stage('Run') {
            steps {
                echo "Running Java program..."
                bat 'java JavaApp'
            }
        }

    }
}
