float colision(Car r, float Dinit, boolean acc) {
  float acc= 100.0f/(1.4f*36.0f);
  float desc= 100.0f/(36.0f);
  if (isBreaking) {
    if (!acc) {
      return -1;
    }
    
    if (r.isBreaking() || r.estalarrer()) {
     
      return -1;
      
    }else {
      float dbreak=speed*speed/(desc*2);
      if (dbreak<=Dinit) {
         return 0.00000001f;
      }
      
     
      float tvMax = (MaxSpeed - speed)/ acc;
      float delta = r.getSpeed()*r.getSpeed() - 2*acc*(Dinit-(getSpeed()*getSpeed())/(desc*2)));
      float t = (-r.getSpeed()+Math.sqrt(delta))/acc;
      
      if (t<=tvMax) {
        if (t<=1.0f) {
          return 1.0f
        }
        return t;
      } else {
        float dA = tvMax*tvMax*acc/2+r.getSpeed()*tvMax+Dinit-MaxSpeed*tvMax;
        t =(speed*speed/(2*desc)-dA)/MaxSpeed;
        if (t<=1.0f) {
          return 1.0f
        }
        return t;

      }
      
      
    }
    
    
                       
  }else if (getSpeed()<MaxSpeed) {
    if (acc) {
      return -1;
    }
    if (r.isBreaking() || r.estalarrer()) {
      return aux(r,Dinit);
    } else if (r.getSpeed()<MaxSpeed) {
      
    
    }else {
    }
    
  }else {
    if (acc) {
      return -1;
    }
     if (r.isBreaking() || r.estalarrer()) {
        return aux(r,Dinit);
     }
    else if (r.getSpeed()<MaxSpeed) {
      
    
     
      
     
      
    }else {
    }
    
  }
}
float aux1(Car r, float Dinit) {
   float acc= 100.0f/(1.4f*36.0f);
   float desc= 100.0f/(36.0f);
   float dFrB=r.getSpeed()*r.getSpeed()/(2*desc);
   float dFrA=getSpeed()*getSpeed()/(2*desc);
   return (Dinit+dFrB-dFrA)/getSpeed(); // apres voir avec plus 1
   
}
