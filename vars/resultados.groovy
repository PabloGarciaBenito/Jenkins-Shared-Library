#!/usr/bin/env Groovy

def call(){
     junit 'java-app/target/surefire-reports/TEST-*.xml'
     archiveArtifacts artifacts: 'java-app/target/surefire-reports/*.xml', fingerprint: true
}