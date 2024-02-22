#!/usr/bin/env groovy

def call(){
    sh '''
    cd java-app/ && /
    mvn -B -DskipTests clean package
    '''
}