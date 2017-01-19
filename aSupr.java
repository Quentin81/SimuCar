float colision(Car r, float Dinit, boolean acc) {
  float acc= 100.0f/(1.4f*36.0f);
  float desc= 100.0f/(36.0f);
  if (isBreaking) {
    if (!acc) {
      return -1;
    }
    if (r.getSpeed()<MaxSpeed) {
      float dbreak=speed*speed/(desc*2);
      if (dbreak<=Dinit) {
         return 0.00000001f;
      }
      
     
      float tvMax = (MaxSpeed - speed)/ acc;

      float delta = r.getSpeed()*r.getSpeed() - 2*acc*(Dinit-(getSpeed()*getSpeed())/(desc*2)));
      float t = (-r.getSpeed()+Math.sqrt(delta))/acc;
      if (t<=tvMax) {
        return t;
      } else {
        float dA = tvMax*tvMax*acc/2+r.getSpeed()*tvMax+Dinit-MaxSpeed*tvMax;
        return (speed*speed/(2*desc)-dA)/MaxSpeed;

      }
    }
    else if (r.isBreaking()) {
      float dbreak=speed*speed/(desc*2);
      if (dbreak<=Dinit) {
         return 0.00000001f;
      }
      float delta = (r.getSpeed()*r.getSpeed() - 2*desc*(Dinit-(getSpeed()*getSpeed())/(desc*2)));
      
    }else {
    }
    
    
                       
  }else if (getSpeed()<MaxSpeed) {
    if (acc) {
      return -1;
    }
    if (r.getSpeed()<MaxSpeed) {
    } else if (r.isBreaking()) {
    }else {
    }
    
  }else {
    if (r.getSpeed()<MaxSpeed) {
    } else if (r.isBreaking()) {
    }else {
    }
    
  }
}

Plot3D[(x+Sqrt[(x*x-2*2.77*(30-y*y/5))])/(2*30),{x,0,13.8},{y,0,13.8}]
