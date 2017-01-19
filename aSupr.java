float colision(Car r, float Dinit) {
  float acc= 100.0f/(1.4f*36.0f);
  float desc= 100.0f/(36.0f);
  float tvMax = (MaxSpeed - speed)/ acc;
  
  float delta = (r.getSpeed()*r.getSpeed() - 2*acc*(Dinit-(getSpeed()*getSpeed())/(desc*2));
  float t = (-r.getSpeed()+Math.sqrt(delta))/acc;
  if (t<=tvMax) {
    return t;
  } else {
    float dA = tvMax*tvMax*acc/2+r.getSpeed()*tvMax+Dinit-MaxSpeed*tvMax;
    return (speed*speed/(2*desc)-dA)/MaxSpeed;
    
  }
  
}
