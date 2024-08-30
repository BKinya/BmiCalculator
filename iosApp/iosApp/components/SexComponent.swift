import SwiftUI

struct SexComponent: View{ 
    var backgroundColor: Color = darkBlue40
    var foregroundColor: Color = .white
    var secondaryForegroundColor = smokeWhite
    var label: String
    var imageId: String
    
    var body: some View{
        BoxComponent(
            backgrounColor: backgroundColor,
            content: VStack{
                Image(imageId)
                    .resizable()
                    .frame(width: 70, height: 70)
                    .foregroundColor(foregroundColor)
                
                        
                Text(label)
                    .font(.system(size: 22, weight: .light))
                    .foregroundColor(secondaryForegroundColor)
                
            }.frame(width: 140, height: 120)
                .padding(16)
            
               
        ) 
        
    }
    
}
