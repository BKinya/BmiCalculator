import SwiftUI

struct WeightAgeComponent : View{
    let backgroundColor: Color = darkBlue40
    let foregroundColor: Color = .white
    let secondaryForegoundColor: Color = smokeWhite
    
    var label: String
    var value: Int
    var onValueChanged :  (Int) -> Void
   
   
    
    var body: some View{
        BoxComponent(
            backgrounColor: backgroundColor,
                     content: VStack{
            Text(label)
                .foregroundColor(secondaryForegoundColor)
                .font(.system(size: 22, weight: .light))
                .padding(.top, 12)
            
            Text("\(value)")
                .foregroundColor(foregroundColor)
                .font(.system(size: 47, weight: .bold))
                .padding(.bottom, -1)
            
            HStack{
                Button(action: {
                    onValueChanged(value + 5)
                }){
                   Circle()
                        .fill(darkBlue70)
                        .overlay(
                            Image("plus")
                                .resizable()
                                .frame(width: 40, height: 40)
                                .foregroundColor(foregroundColor))
                        .frame(width: 60, height: 60)
                    
                }
                Spacer().frame(width: 32)
                
                Button(action: {
                    onValueChanged(value - 1)
                }){
                    Circle()
                         .fill(darkBlue70)
                         .overlay(
                             Image("minus")
                                 .resizable()
                                 .frame(width: 40, height: 40)
                                 .foregroundColor(foregroundColor))
                         .frame(width: 60, height: 60)
                }
                
            }.frame(maxWidth: /*@START_MENU_TOKEN@*/.infinity/*@END_MENU_TOKEN@*/, alignment: .center)
            Spacer().frame(height: 20)
                     })
    }
    
}
