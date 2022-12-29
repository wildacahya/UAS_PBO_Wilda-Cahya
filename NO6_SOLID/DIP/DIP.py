class Device(ABC):
  power: boolean
    
  def __init__(self, initial_state: bool=False):
    self.power = initial_state
    
  def turn_on(self):
    raise NotImplementedError
  
  def turn_off(self):
    raise NotImplementedError
    
class Switch:
  
  def __init__(self, device: Device, pressed: bool=False):
    self.device = device
    self.pressed = pressed
    
  def toggle(self):
    self.pressed = not self.pressed # Toggle
    if self.pressed:
      self.device.turn_on()
    else:
      self.device.turn_off()  

class LightBulb(Device):
  
  def turn_on(self):
    self.power = True
    
  def turn_off(self):
    self.power = False
