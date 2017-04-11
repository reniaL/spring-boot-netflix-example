#!/usr/bin/env bash
gradle build
gradle bootRun -p eureka-demo-server &
gradle bootRun -p eureka-demo-notification &
gradle bootRun -p eureka-demo-user &