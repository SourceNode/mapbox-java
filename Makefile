checkstyle:
	./gradlew checkstyle

sonarqube:
	     ./gradlew sonarqube \
	        -DskipTests=true \
	        -Dsonar.host.url=https://sonarcloud.io \
	        -Dsonar.organization=mapbox \
	        -Dsonar.login=$(SONARQUBE_API_TOKEN) \
	        -Dsonar.test.failure.ignore=true

test:
	./gradlew :services:test ; \
    ./gradlew :services-directions:test ; \
    ./gradlew :services-geocoding:test ; \
    ./gradlew :services-geojson:test ; \
    ./gradlew :services-matching:test ; \
    ./gradlew :services-matrix:test ; \
    ./gradlew :services-optimization:test ; \
    ./gradlew :services-staticmap:test ; \
    ./gradlew :services-turf:test

build-release:
    ./gradlew :services:assemble ; \
    ./gradlew :services-directions:assemble ; \
    ./gradlew :services-geocoding:assemble ; \
    ./gradlew :services-geojson:assemble ; \
    ./gradlew :services-matching:assemble ; \
    ./gradlew :services-matrix:assemble ; \
    ./gradlew :services-optimization:assemble ; \
    ./gradlew :services-staticmap:assemble ; \
    ./gradlew :services-turf:assemble

publish:
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-directions:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-geocoding:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-geojson:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-matching:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-matrix:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-optimization:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-staticmap:uploadArchives ; \
    export IS_LOCAL_DEVELOPMENT=false; ./gradlew :services-turf:uploadArchives ; \

#TODO add get fixture commands