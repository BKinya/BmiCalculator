import SwiftUI

struct HeightComponent: View{
    let backgrounColor: Color = darkBlue40
    let textColor: Color = .white
    let secondaryTextColor: Color = smokeWhite
    let sliderColor: Color = .pink
    
  /**
   create a height variable and provide a call back to update the height
   */
    
    @State private var height = 54.6
    
    var body: some View{
        BoxComponent(backgrounColor: backgrounColor, 
                     content: VStack{
            Text("Height")
                .foregroundColor(secondaryTextColor)
                .font(.system(size: 22, weight: .light))
                .padding(.top, 12)
            
            HStack{
                Text("\(height.rounded(.up).formatted(.number.precision(.fractionLength(0))))")
                    .foregroundColor(textColor)
                    .font(.system(size: 47, weight: .bold))
                    
                VStack{
                    Spacer().frame(height: 16)
                    Text("cm")
                        .foregroundColor(secondaryTextColor)
                        .font(.system(size: 20, weight: .light))
                }
                
            }

            .padding(.bottom, -1)
            Slider(
                value: $height, // is it possible to extract this to a function? Will find out later
                // and the whole UDF stuff. 
                in: 53...290
             )
            .accentColor(sliderColor)
            .padding(.bottom, 12)
            .padding(.horizontal, 8)
        
            
        }.frame(maxWidth: .infinity, alignment: .center)
            .padding()
        )
    }
}
