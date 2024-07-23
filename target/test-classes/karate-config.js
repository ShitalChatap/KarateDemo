function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    baseURL: 'https://api.instantwebtools.net/v1'
  }
  if (env == 'dev') {
    
  } else if (env == 'e2e') {
    
  }
  return config;
}