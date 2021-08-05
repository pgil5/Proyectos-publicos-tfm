using System.Diagnostics;
using System;
using NMF.Models.Repository;
using ECoreNetto.Resource;
using System.IO;
using System.Runtime.InteropServices;
using Xbim.Ifc;
using Xbim.IO;
using Xbim.Ifc4.Kernel;
using Xbim.Common;
using Xbim.Ifc4.SharedBldgElements;
using Xbim.Ifc4.PropertyResource;
using Xbim.Ifc4.MeasureResource;
using System;
using System.Linq;
using Xbim.Ifc;
using Xbim.Ifc4.Interfaces;

//using net.sf.jni4net;

//[assembly: NMF.Models.ModelMetadata("https://github.com/NMFCode/NMFDemo", "fsm.nmf")]

namespace xbimPrueba
{
    class Program
    {
        static void Main()
        {
            ReadIfcSample();
        }

        static void ReadIfcSample()
        {
            const string fileName = "C:\\Users\\pablo\\Clase\\TFM\\TFM-Code\\code\\pruebasConsola\\SampleHouse.ifc";
            using (var model = IfcStore.Open(fileName))
            {
                //get all doors in the model (using IFC4 interface of IfcDoor this will work both for IFC2x3 and IFC4)
                var allDoors = model.Instances.OfType<IIfcDoor>();

                //get only doors with defined IIfcTypeObject
                var someDoors = model.Instances.Where<IIfcDoor>(d => d.IsTypedBy.Any());

                //get one single door 
                var id = "3cUkl32yn9qRSPvBJVyWYp";
                var theDoor = model.Instances.FirstOrDefault<IIfcDoor>(d => d.GlobalId == id);
                Console.WriteLine($"Door ID: {theDoor.GlobalId}, Name: {theDoor.Name}");

                //get all single-value properties of the door
                var properties = theDoor.IsDefinedBy
                    .Where(r => r.RelatingPropertyDefinition is IIfcPropertySet)
                    .SelectMany(r => ((IIfcPropertySet)r.RelatingPropertyDefinition).HasProperties)
                    .OfType<IIfcPropertySingleValue>();
                foreach (var property in properties)
                    Console.WriteLine($"Property: {property.Name}, Value: {property.NominalValue}");
            }
        }

        static void CreateIfcSample()
        {
            var editor = new XbimEditorCredentials
            {
                ApplicationDevelopersName = "xbim developer",
                ApplicationFullName = "xbim toolkit",
                ApplicationIdentifier = "xbim",
                ApplicationVersion = "4.0",
                EditorsFamilyName = "Santini Aichel",
                EditorsGivenName = "Johann Blasius",
                EditorsOrganisationName = "Independent Architecture"
            };
            using (var model = IfcStore.Create(editor, Xbim.Common.Step21.XbimSchemaVersion.Ifc4, XbimStoreType.InMemoryModel))
            {
                using (var txn = model.BeginTransaction("Hello Wall"))
                {
                    //there should always be one project in the model
                    var project = model.Instances.New<IfcProject>(p => p.Name = "Basic Creation");
                    //our shortcut to define basic default units
                    project.Initialize(ProjectUnits.SIUnitsUK);

                    //create simple object and use lambda initializer to set the name
                    var wall = model.Instances.New<IfcWall>(w => w.Name = "The very first wall");

                    //set a few basic properties
                    model.Instances.New<IfcRelDefinesByProperties>(rel => {
                        rel.RelatedObjects.Add(wall);
                        rel.RelatingPropertyDefinition = model.Instances.New<IfcPropertySet>(pset => {
                            pset.Name = "Basic set of properties";
                            pset.HasProperties.AddRange(new[] {
                    model.Instances.New<IfcPropertySingleValue>(p =>
                    {
                        p.Name = "Text property";
                        p.NominalValue = new IfcText("Any arbitrary text you like");
                    }),
                    model.Instances.New<IfcPropertySingleValue>(p =>
                    {
                        p.Name = "Length property";
                        p.NominalValue = new IfcLengthMeasure(56.0);
                    }),
                    model.Instances.New<IfcPropertySingleValue>(p =>
                    {
                        p.Name = "Number property";
                        p.NominalValue = new IfcNumericMeasure(789.2);
                    }),
                    model.Instances.New<IfcPropertySingleValue>(p =>
                    {
                        p.Name = "Logical property";
                        p.NominalValue = new IfcLogical(true);
                    })
                });
                        });
                    });

                    txn.Commit();
                }
                model.SaveAs("BasicWall.ifc");
            }
        }
    }
}
//[assembly: NMF.Models.ModelMetadata("GameCreator", "Game.nmf")]
//namespace JavaEnDotnet
//{
//    class Program
//    {
//        static void Main()
//        {
//            Bridge.CreateJVM(new BridgeSetup());
//            java.lang.System.@out.println("Greetings from C# to Java world!");
//        }
//    }
//}

//namespace ECoreNettoPrueba
//{
//    class Program
//    {
        
//        static void Main(string[] args)
//        {
//            //Console.WriteLine(RuntimeInformation.FrameworkDescription);
//            LoadEcoreNetto();
//        }

//        public static void LoadEcoreNetto()
//        {
//            string path = "C:\\Users\\pablo\\Clase\\TFM\\TFM-Code\\code\\pruebasConsola\\ecore.ecore";
//            Uri uri = new Uri(path);
//            ResourceSet resourceSet = new ResourceSet();

//            var resource = resourceSet.CreateResource(uri);
//            var root = resource.Load(null);
//        }
//    }
//}

//namespace DemoNMF.FSM
//{
//    class Program
//    {
//        static void Main(string[] args)
//        {
//            Intentos de hacer funcionar la extensión del investigador aquél
//            var repository = new ModelRepository();
//            var model = repository.Resolve("Example.fsm");
//            var fsm = model.RootElements[0]; // as FiniteStateMachine;

//            Console.WriteLine("Breakpoint para analizar el codigo.");
//        }
//    }
//}

//namespace pruebasConsola
//{
//    class Program
//    {
//        //static void Main(string[] args)
//        //{
//        //    //ExecuteCommand("");

//        //    //
//        //    //var repository = new ModelRepository();
//        //    //var model = repository.Resolve("Game.xmi");
//        //    //var xmi = model.RootElements[0] as GameCreator.Game;
//        //    //var xmi = model.RootElements;

//        //    Console.WriteLine("Breakpoint para analizar el codigo.");
//        //}

//        /* Función para ejecutar un archivo .jar desde .NET */
//        public static void ExecuteCommand(string parameter)
//        {
//            int exitcode;
//            string output, error;
//            ProcessStartInfo ProcessInfo;
//            Process process;

//            ProcessInfo = new ProcessStartInfo("java.exe", "-jar C:\\Users\\pablo\\Clase\\TFM\\TFM-Code\\code\\pruebasConsola\\pruebaJava.jar" + parameter);

//            ProcessInfo.CreateNoWindow = true;
//            ProcessInfo.UseShellExecute = false;

//            ProcessInfo.RedirectStandardError = true;
//            ProcessInfo.RedirectStandardOutput = true;

//            process = Process.Start(ProcessInfo);

//            process.WaitForExit();

//            output = process.StandardOutput.ReadToEnd();
//            error = process.StandardError.ReadToEnd();

//            exitcode = process.ExitCode;

//            Console.WriteLine("Output: " + output);

//            if(!error.Equals(""))
//            {
//                Console.WriteLine("Error: " + error);
//                Console.WriteLine("Exit Code: " + exitcode);
//            }

//            process.Close();
//        }
//    }
//}