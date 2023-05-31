import http.client
import json
  
class FloodlightApi(object):
  
    def __init__(self, server):
        self.server = server
  
    def get(self, data, path):
        ret = self.rest_call(data, 'GET', path)
        return json.loads(ret[2])
  
    def set(self, data):
        ret = self.rest_call(data, 'POST', path)
        return ret[0] == 200
  
    def remove(self, objtype, data, path):
        ret = self.rest_call(data, 'DELETE', path)
        return ret[0] == 200
  
    def rest_call(self, data, action, path):
        
        headers = {
            'Content-type': 'application/json',
            'Accept': 'application/json',
            }
        body = json.dumps(data)
        conn = http.client.HTTPConnection(self.server, 8080)
        conn.request(action, path, body, headers)
        response = conn.getresponse()
        ret = (response.status, response.reason, response.read())
        print(ret)
        conn.close()
        return ret


'''

pusher = FloodlightApi('192.168.56.100')

flow1 = {
    'switch':"00:00:00:00:00:00:00:01",
    "name":"flow_mod_1",
    "cookie":"0",
    "priority":"32768",
    "in_port":"1",
    "active":"true",
    "actions":"output=flood"
    }
  
flow2 = {
    'switch':"00:00:00:00:00:00:00:01",
    "name":"flow_mod_2",
    "cookie":"0",
    "priority":"32768",
    "in_port":"2",
    "active":"true",
    "actions":"output=flood"
    }
  
#pusher.set(flow1)
#pusher.set(flow2)

'''