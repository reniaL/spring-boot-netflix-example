#!/usr/bin/env bash
kill $(cat eureka-demo-notification/notification.pid)
kill $(cat eureka-demo-user/user.pid)
kill $(cat eureka-demo-server/server.pid)
