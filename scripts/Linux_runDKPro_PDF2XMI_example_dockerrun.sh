#!/bin/bash

sudo docker run  -v $(pwd)/../testInput2/:/opt/omtd-simple-workflows/testInput/ -v $(pwd)/../testOutput/:/opt/omtd-simple-workflows/testOutput/ omtd-simple-workflows-docker ./Linux_runDKPro.sh eu.openminted.simplewokflows.dkpro.PipelinePDFToXMI /opt/omtd-simple-workflows/testInput/ /opt/omtd-simple-workflows/testOutput/ 

