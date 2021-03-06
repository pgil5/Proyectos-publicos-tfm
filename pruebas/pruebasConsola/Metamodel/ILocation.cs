//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace pruebasConsola.GameCreator
{
    
    
    /// <summary>
    /// The public interface for Location
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Location))]
    [XmlDefaultImplementationTypeAttribute(typeof(Location))]
    public interface ILocation : IModelElement
    {
        
        /// <summary>
        /// The name property
        /// </summary>
        [DisplayNameAttribute("name")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("name")]
        [IdAttribute()]
        [XmlAttributeAttribute(true)]
        string Name
        {
            get;
            set;
        }
        
        /// <summary>
        /// The fullName property
        /// </summary>
        [DisplayNameAttribute("fullName")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("fullName")]
        [XmlAttributeAttribute(true)]
        string FullName
        {
            get;
            set;
        }
        
        /// <summary>
        /// The coordX property
        /// </summary>
        [DisplayNameAttribute("coordX")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("coordX")]
        [XmlAttributeAttribute(true)]
        double CoordX
        {
            get;
            set;
        }
        
        /// <summary>
        /// The coordY property
        /// </summary>
        [DisplayNameAttribute("coordY")]
        [CategoryAttribute("Location")]
        [XmlElementNameAttribute("coordY")]
        [XmlAttributeAttribute(true)]
        double CoordY
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the Name property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NameChanging;
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NameChanged;
        
        /// <summary>
        /// Gets fired before the FullName property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> FullNameChanging;
        
        /// <summary>
        /// Gets fired when the FullName property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> FullNameChanged;
        
        /// <summary>
        /// Gets fired before the CoordX property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CoordXChanging;
        
        /// <summary>
        /// Gets fired when the CoordX property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CoordXChanged;
        
        /// <summary>
        /// Gets fired before the CoordY property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CoordYChanging;
        
        /// <summary>
        /// Gets fired when the CoordY property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> CoordYChanged;
    }
}

