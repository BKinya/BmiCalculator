import SwiftUI


struct SexComponent: View{
    var isSelected: Bool = false

    
    var backGroundColor: Color {
         isSelected ? darkBlue40 : darkBlue10
    }
    var textColor: Color {
        isSelected ? .white : smokeWhite50
    }
    var secondaryTextColor: Color {
        isSelected ? smokeWhite : smokeWhite50
    }
    var label: String = "Male"
    var imageId: String = "male"
   
    var tapAction : () -> Void
    
    var body: some View{
        BoxComponent(
            backgrounColor: backGroundColor,
            content: VStack{
                Image(imageId)
                    .resizable()
                    .frame(width: 70, height: 70)
                    .foregroundColor(textColor)
                
                        
                Text(label)
                    .font(.system(size: 22, weight: .light))
                    .foregroundColor(secondaryTextColor)
                
            }.frame(width: 140, height: 120)
                .padding(16)
                .onTapGesture {
                    tapAction()
                }
            
               
        ) 
        
    }
    
}
