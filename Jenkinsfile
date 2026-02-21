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
                bat 'javac Java1.java'
            }
        }

        stage('Run') {
            steps {
                echo "Running Java program..."
                bat 'java Java1'
            }
        }

    }
}

