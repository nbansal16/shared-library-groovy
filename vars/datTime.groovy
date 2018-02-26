#!/usr/bin/env groovy
import java.text.SimpleDateFormat

def call(){
    echo "time1"
    def date = new Date()
    def sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    echo "${sdf.format(date)}"
    echo "time"
}
