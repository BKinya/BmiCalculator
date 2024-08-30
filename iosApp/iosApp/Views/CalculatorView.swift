import SwiftUI
import Shared

struct CalculatorView: View {

  
    var body: some View {
        VStack {
            TitleComponent()
                   


            HStack{
                SexComponent(label: "Male", imageId: "male")
                    
                SexComponent(backgroundColor: darkBlue10,
                                foregroundColor: smokeWhite50,
                                secondaryForegroundColor: smokeWhite50,
                                label: "Female", imageId: "female"
                                )
                }
            .frame(maxWidth: .infinity, alignment: .center)
            
            HeightComponent()
            
            HStack{
                WeightAgeComponent(
                label: "Weight")
                WeightAgeComponent(
                label: "Age")
            }.frame(maxWidth: .infinity, alignment: .center)

            Spacer()
            ButtonComponent(backgroundColor: .pink, buttonText: "Calculate", clickAction: {
                print("My first reusable components")
            }).padding(.bottom, 7)
            
            

        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .background(darkNavy)


    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        CalculatorView()
    }
}
