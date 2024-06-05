class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        //PTruck
        int pickP = 0;
        int travelP = 0;
        int lastHouseP = 0;

        //MTruck
        int pickM = 0;
        int travelM = 0;
        int lastHouseM = 0;

        //GTruck
        int pickG = 0;
        int travelG = 0;
        int lastHouseG = 0;

        //travel to every home
        for(int i =0; i<garbage.size(); i++){
            string currHouse = garbage[i];
            //traversing each house to find garbage type
            for(int j = 0; j<currHouse.length(); j++){
                char garbageType = currHouse[j];
                if(garbageType == 'P'){
                    pickP++;
                    lastHouseP = i;
                }
                if(garbageType == 'M'){
                    pickM++;
                    lastHouseM = i;
                }
                if(garbageType == 'G'){
                    pickG++;
                    lastHouseG = i;
                }
            }
        }

        //calculating travel time for each truck
        for(int i = 0; i<lastHouseP; i++){
            travelP += travel[i];
        }

        for(int i = 0; i<lastHouseM; i++){
            travelM += travel[i];
        }

        for(int i = 0; i<lastHouseG; i++){
            travelG += travel[i];
        }

        return pickP + travelP + pickM + travelM + pickG + travelG;
    }
};