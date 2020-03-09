#!/usr/bin/groovy

// load pipeline functions
// Requires pipeline-github-lib plugin to load library from github

// @Library('github.com/gonac/ci-poc@test')

node () {

    // def pwd = pwd()

    checkout scm

    // Get services

    // Get changed services

    // read config for changed services

     def config = readJSON(file: 'Jenkinsfile.json')


    stage ('init') {

      // read in required jenkins workflow config values

      // def config = new groovy.json.JsonSlurperClassic().parseText(inputFile)
      println "pipeline config ==> ${config}"
      echo "working"
      // continue only if pipeline enabled
      if (!config.pipeline.enabled) {
          println "pipeline disabled"
          // mark build as failed
          return
      }


      // If pipeline debugging enabled
      if (config.pipeline.debug) {
        println "DEBUG ENABLED"
        sh "env | sort"
      }

    }

    stage ('Lint') {

      // isPRDone("gonac", "ci-poc")

    }

    stage ('test') {
      if (config.pipeline.lint) {

        sh "make lint"
      }

    }

    stage ('Sonar scan') {
      if (config.pipeline.lint) {

        sh "make lint"
      }

    }

    stage ('Build and push image') {
      if (config.pipeline.lint) {

        sh "make lint"
      }

    }

    stage ('Deploy') {
      if (config.pipeline.lint) {

        sh "make lint"
      }

    }
  }