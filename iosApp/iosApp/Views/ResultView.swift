import SwiftUI

struct ResultView : View{
    
    var body: some View{
        VStack{
            TitleComponent()
            
            BigTextComponent().padding()
            BoxComponent(backgrounColor: darkBlue40,
                         content: VStack{
                Spacer().frame(height: 57)
             BoldTextComponent(
             text: "NORMAL",
             fontSize: 32,
             textColor: .green)
                Spacer()
                
                BigTextComponent(text: "22.3",
                                 fontSize: 100.0)
                Spacer()
                
                RegularTextComponent(
                    text: "You have a normal body weight. Good Job!",
                    fontSize: 27
                )
                .multilineTextAlignment(.center)
               
                Spacer()
                
            }.frame(maxWidth: /*@START_MENU_TOKEN@*/.infinity/*@END_MENU_TOKEN@*/)
            
            )
            Spacer()
            ButtonComponent(backgroundColor: .pink, buttonText: "Re-Calculate", clickAction: {
                print("My second reusable components")
            }).padding(.bottom, 7)
                .padding(.top, 12)
            
        }.frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
            .background(darkNavy)
        
    }
    
}

struct ResultView_Previews: PreviewProvider {
    static var previews: some View {
        ResultView()
    }
}

