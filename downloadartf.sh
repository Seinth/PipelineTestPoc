#!/bin/bash

for i in $@; do
  echo $i
  mkdir -p $(dirname /home/wilkocki/Repos/PipelineTestPoc/m2repo/${i})
  cd $(dirname /home/wilkocki/Repos/PipelineTestPoc/m2repo/${i})
  wget http://central.maven.org/maven2/${i}.{jar,pom}
  cd -
done
