### STAGE 1: Build ###
FROM node:12.7-alpine AS build
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build -- --prod

### STAGE 2: Run ###
FROM nginxinc/nginx-unprivileged
COPY --chown=nginx:nginx nginx.conf /etc/nginx/nginx.conf
USER root
RUN chmod -R 777 /var/log/nginx /var/cache/nginx/ /var/run
RUN chmod 644 /etc/nginx/*
USER nginx
COPY --chown=nginx:nginx --from=build /usr/src/app/dist/rpt-payment /usr/share/nginx/html
