# RptPayment

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 9.1.7.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

## Building and Testing the Containerized Application

Build the image:
$ docker build -t rtp-ui-app .
Sending build context to Docker daemon  2.694MB
Step 1/9 : FROM node:12.7-alpine AS build
 ---> d97a436daee9
Step 2/9 : WORKDIR /usr/src/app
 ---> Using cache
 ---> 35b0d11e5dd1
Step 3/9 : COPY package.json package-lock.json ./
 ---> Using cache
 ---> d27488a543ce
Step 4/9 : RUN npm install
 ---> Using cache
 ---> 9b56f2be471a
Step 5/9 : COPY . .
 ---> Using cache
 ---> 301eb6297f67
Step 6/9 : RUN npm run build -- --prod
 ---> Using cache
 ---> c136dfb1df60
Step 7/9 : FROM nginx:1.17.1-alpine
 ---> ea1193fd3dde
Step 8/9 : COPY nginx.conf /etc/nginx/nginx.conf
 ---> Using cache
 ---> b07640535e83
Step 9/9 : COPY --from=build /usr/src/app/dist/rpt-payment /usr/share/nginx/html
 ---> Using cache
 ---> 92af629c32bc
Successfully built 92af629c32bc
Successfully tagged rtp-ui-app:latest

Run the image:
$ docker run --name rtp-app-container -d -p 8888:80 rtp-ui-app
1fed84833d7989b27fa61e7884f50be4914d42e6cc6c2181bb25bd0ae97504a2

Check the running image in docker:
$ docker ps
CONTAINER ID        IMAGE               COMMAND                  CREATED              STATUS              PORTS                  NAMES
1fed84833d79        rtp-ui-app          "nginx -g 'daemon of…"   About a minute ago   Up About a minute   0.0.0.0:8888->80/tcp   rtp-app-container

The application can be accessed from a browser at: http://localhost:8888/app-home-screen
